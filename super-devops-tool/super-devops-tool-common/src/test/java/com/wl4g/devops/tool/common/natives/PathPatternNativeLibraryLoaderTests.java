/*
 * Copyright 2017 ~ 2025 the original author or authors. <wanglsir@gmail.com, 983708408@qq.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wl4g.devops.tool.common.natives;

import static org.apache.commons.lang3.SystemUtils.OS_ARCH;
import static org.apache.commons.lang3.SystemUtils.OS_NAME;

public class PathPatternNativeLibraryLoaderTests {

	public static void main(String[] args) throws Exception {
		test1();
		test2();
	}

	public static void test1() {
		System.out.println("/a sdf ".split("/").length);
		System.out.println(OS_NAME);
		System.out.println(OS_ARCH);
	}

	public static void test2() throws Exception {
		new PathPatternNativeLibraryLoader().loadLibrarys("/org/xerial/snappy/native/**/*.*");
		System.out.println("Demo execution waiting... Observe whether temporary files will be cleared when exiting");
		Thread.sleep(3000L);
	}

}