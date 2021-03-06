/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.testing.junit4.tests;

import static org.junit.Assert.assertEquals;

import com.google.cloud.testing.junit4.StdOutCaptureRule;
import org.junit.Rule;
import org.junit.Test;

public class StdOutCaptureRuleTest {

  @Rule public StdOutCaptureRule stdOutCap = new StdOutCaptureRule();

  @Test
  public void captureSuccessful() {
    System.out.println("hello world");
    String expected = "hello world" + System.lineSeparator();
    String actual = stdOutCap.getCapturedOutputAsUtf8String();
    assertEquals(expected, actual);
  }
}
