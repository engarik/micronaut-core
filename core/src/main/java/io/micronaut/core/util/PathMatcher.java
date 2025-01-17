/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.core.util;

/**
 * Interface for components that can match source strings against a specified pattern string.
 * <p/>
 * Different implementations can support different pattern types, for example, Ant style path expressions, or
 * regular expressions, or other types of text based patterns.
 *
 * @since 1.0
 */
public interface PathMatcher {
    /**
     * The default Ant style path matcher.
     */
    AntPathMatcher ANT = new AntPathMatcher();
    /**
     * The default regex style path matcher.
     */
    RegexPathMatcher REGEX = new RegexPathMatcher();

    /**
     * Returns <code>true</code> if the given <code>source</code> matches the specified <code>pattern</code>,
     * <code>false</code> otherwise.
     *
     * @param pattern the pattern to match against
     * @param source  the source to match
     * @return <code>true</code> if the given <code>source</code> matches the specified <code>pattern</code>,
     * <code>false</code> otherwise.
     */
    boolean matches(String pattern, String source);
}
