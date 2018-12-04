/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.elasticjob.cloud.executor;

import io.elasticjob.cloud.executor.handler.ExecutorServiceHandlerRegistryTest;
import io.elasticjob.cloud.executor.handler.JobPropertiesTest;
import io.elasticjob.cloud.executor.handler.impl.DefaultJobExceptionHandlerTest;
import io.elasticjob.cloud.executor.type.DataflowJobExecutorTest;
import io.elasticjob.cloud.executor.type.ScriptJobExecutorTest;
import io.elasticjob.cloud.executor.type.SimpleJobExecutorTest;
import io.elasticjob.cloud.executor.type.WrongJobExecutorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        JobExecutorFactoryTest.class,
        ExecutorServiceHandlerRegistryTest.class, 
        JobPropertiesTest.class,
        DefaultJobExceptionHandlerTest.class, 
        SimpleJobExecutorTest.class,
        WrongJobExecutorTest.class,
        DataflowJobExecutorTest.class, 
        ScriptJobExecutorTest.class
    })
public final class AllExecutorTests {
}
