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

package io.elasticjob.cloud.scheduler.mesos;

import io.elasticjob.cloud.scheduler.mesos.fixture.OfferBuilder;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public final class LeasesQueueTest {
    
    private LeasesQueue leasesQueue = LeasesQueue.getInstance();
    
    @Test
    public void assertOperate() {
        assertTrue(leasesQueue.drainTo().isEmpty());
        leasesQueue.offer(OfferBuilder.createOffer("offer_1"));
        leasesQueue.offer(OfferBuilder.createOffer("offer_2"));
        assertThat(leasesQueue.drainTo().size(), is(2));
    }
}
