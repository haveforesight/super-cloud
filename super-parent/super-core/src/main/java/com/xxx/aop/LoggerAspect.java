package com.xxx.aop;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

@Aspect
@Component
public class LoggerAspect {
	
	@Around("execution(* com.xxx.*.controller.*.*(..))")  
    public Object logger(ProceedingJoinPoint pjp) throws Throwable{
		
		Signature signature = pjp.getSignature();
		pjp.getSignature().getName();
		MethodSignature methodSignature = (MethodSignature) signature;
		String [] parameterNames  = methodSignature.getParameterNames();
		Object [] parameterValues = pjp.getArgs();
		
		Gson json =new Gson();
		for (int i = 0; i < parameterValues.length; i++) {
			String name = parameterNames[i];
			Object value= parameterValues[i];
			if(value instanceof HttpServletRequest){
				HttpServletRequest request =(HttpServletRequest)value;
			}else{
				//value.toString();
			}
			
		}
        Object result = pjp.proceed();
        System.out.println("调用的方法：" + pjp.getSignature().getName() + "，传递参数：" + "，返回参数：" + result);
        return result;
	}
	
	static final class CustomKey {

        private final Class<?> clazz;
        private final String methodName;
        private final Object[] params;
        private final int hashCode;

        /**
         * Initialize a key.
         *
         * @param clazz the receiver class
         * @param methodName the method name
         * @param params the method parameters
         */
        CustomKey(Class<?> clazz, String methodName, Object[] params) {
            this.clazz = clazz;
            this.methodName = methodName;
            this.params = params;
            int code = Arrays.deepHashCode(params);
            code = 31 * code + clazz.hashCode();
            code = 31 * code + methodName.hashCode();
            this.hashCode = code;
        }

        @Override
        public int hashCode() {
            return this.hashCode;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomKey)) {
                return false;
            }
            CustomKey other = (CustomKey) obj;
            if (this.hashCode != other.hashCode) {
                return false;
            }

            return this.clazz.equals(other.clazz)
                    && this.methodName.equals(other.methodName)
                    && Arrays.deepEquals(this.params, other.params);
        }

    }


}
