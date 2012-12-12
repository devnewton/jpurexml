/**
 * Copyright Antoni Silvestre
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.github.asilvestre.jpurexml;

/**
 * Generic utilities for the XML parser and the JSON converter
 */
public class Utils {
	
	/**
	 * Simple replace string function, String.ReplaceAll uses regular expressions internally and might not
	 * transcompile correctly to all platforms
	 * @param input
	 * @param toReplace
	 * @param replacement
	 * @return
	 */
	public static String ReplaceStr(String input, String toReplace, String replacement)
	{
		String res = input;
		
		int replacePos = input.indexOf(toReplace);
		while (replacePos != -1)
		{
			res = String.format("%s%s%s", res.substring(0, replacePos), replacement,
					res.substring(replacePos + toReplace.length()));
			
			replacePos = res.indexOf(toReplace, replacePos + replacement.length());
		}
		
		return res;
	}

}