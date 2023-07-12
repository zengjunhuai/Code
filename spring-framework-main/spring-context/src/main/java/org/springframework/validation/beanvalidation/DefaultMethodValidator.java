/*
 * Copyright 2002-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.validation.beanvalidation;

import java.lang.reflect.Method;

import org.springframework.core.MethodParameter;
import org.springframework.lang.Nullable;

/**
 * Default implementation of {@link MethodValidator} that delegates to a
 * {@link MethodValidationAdapter}. Also, convenient as a base class that allows
 * handling of the validation result.
 *
 * @author Rossen Stoyanchev
 * @since 6.1
 */
public class DefaultMethodValidator implements MethodValidator {

	private final MethodValidationAdapter adapter;


	public DefaultMethodValidator(MethodValidationAdapter adapter) {
		this.adapter = adapter;
	}


	@Override
	public Class<?>[] determineValidationGroups(Object bean, Method method) {
		return MethodValidationAdapter.determineValidationGroups(bean, method);
	}

	@Override
	public void validateArguments(
			Object target, Method method, @Nullable MethodParameter[] parameters, Object[] arguments,
			Class<?>[] groups) {

		handleArgumentsValidationResult(target, method, arguments, groups,
				this.adapter.validateMethodArguments(target, method, parameters, arguments, groups));
	}

	public void validateReturnValue(
			Object target, Method method, @Nullable MethodParameter returnType, @Nullable Object returnValue,
			Class<?>[] groups) {

		handleReturnValueValidationResult(target, method, returnValue, groups,
				this.adapter.validateMethodReturnValue(target, method, returnType, returnValue, groups));
	}

	/**
	 * Subclasses can override this to handle the result of argument validation.
	 * By default, {@link MethodValidationResult#throwIfViolationsPresent()} is called.
	 * @param bean the target Object for method invocation
	 * @param method the target method
	 * @param arguments the candidate argument values to validate
	 * @param groups groups for validation determined via
	 */
	protected void handleArgumentsValidationResult(
			Object bean, Method method, Object[] arguments, Class<?>[] groups, MethodValidationResult result) {

		result.throwIfViolationsPresent();
	}

	/**
	 * Subclasses can override this to handle the result of return value validation.
	 * By default, {@link MethodValidationResult#throwIfViolationsPresent()} is called.
	 * @param bean the target Object for method invocation
	 * @param method the target method
	 * @param returnValue the return value to validate
	 * @param groups groups for validation determined via
	 */
	protected void handleReturnValueValidationResult(
			Object bean, Method method, @Nullable Object returnValue, Class<?>[] groups, MethodValidationResult result) {

		result.throwIfViolationsPresent();
	}

}
