/*
 * Copyright 2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package kotlinx.atomicfu.test

import org.junit.Test

class ArithmeticTest {
    @Test
    fun testInt() {
        val a = IntArithmetic()
        check(a.x == 0)
        a.lazySet(1)
        check(a.x == 1)
        check(a.getAndSet(2) == 1)
        check(a.x == 2)
        check(a.getAndIncrement() == 2)
        check(a.x == 3)
        check(a.getAndDecrement() == 3)
        check(a.x == 2)
        check(a.getAndAdd(2) == 2)
        check(a.x == 4)
        check(a.addAndGet(3) == 7)
        check(a.x == 7)
        check(a.incrementAndGet() == 8)
        check(a.x == 8)
        check(a.decrementAndGet() == 7)
        check(a.x == 7)
    }

    @Test
    fun testLong() {
        val a = LongArithmetic()
        check(a.x == 0L)
        a.lazySet(1)
        check(a.x == 1L)
        check(a.getAndSet(2) == 1L)
        check(a.x == 2L)
        check(a.getAndIncrement() == 2L)
        check(a.x == 3L)
        check(a.getAndDecrement() == 3L)
        check(a.x == 2L)
        check(a.getAndAdd(2) == 2L)
        check(a.x == 4L)
        check(a.addAndGet(3) == 7L)
        check(a.x == 7L)
        check(a.incrementAndGet() == 8L)
        check(a.x == 8L)
        check(a.decrementAndGet() == 7L)
        check(a.x == 7L)
    }
}