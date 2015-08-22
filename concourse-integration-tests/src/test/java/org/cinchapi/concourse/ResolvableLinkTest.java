/*
 * Copyright (c) 2013-2015 Cinchapi Inc.
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
package org.cinchapi.concourse;

import java.util.Map;
import java.util.Set;

import org.cinchapi.concourse.util.Convert;
import org.cinchapi.concourse.util.TestData;
import org.junit.Assert;
import org.junit.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * Integration tests to verify the resolvable link functionality.
 * 
 * @author Jeff Nelson
 */
public class ResolvableLinkTest extends ConcourseIntegrationTest {
    
    @Test
    public void testInsertRemoteResolvableLink(){
        String key = "age";
        int value = 10;
        int count = TestData.getScaleCount();
        for(int i = 1; i <= value + count; ++i){
            client.add(key, i);
        }
        JsonObject json = new JsonObject();
        json.addProperty("friends", Convert.stringToResolvableLinkInstruction("age > "+value));
        client.insert(json.toString(), 1);
        Set<Object> friends = client.select("friends", 1);
        Assert.assertEquals(count, friends.size());
    }
    
    @Test
    public void testInsertLocalResolvableLink(){
        JsonObject json1 = new JsonObject();
        JsonObject json2 = new JsonObject();
        JsonObject json3 = new JsonObject();
        JsonObject json4 = new JsonObject();
        json1.addProperty("foo", 10);
        json1.addProperty("name", "Jeff");
        json1.addProperty("similar_to", "@foo < 50 and name = Jeff@");
        json2.addProperty("foo", 20);
        json2.addProperty("name", "Jeff");
        json2.addProperty("similar_to", "@foo < 50 and name = Jeff@");
        json3.addProperty("foo", 30);
        json3.addProperty("name", "John");
        json3.addProperty("similar_to", "@foo < 50 and name = Jeff@");
        json4.addProperty("foo", 40);
        json4.addProperty("name", "Jeff");
        json4.addProperty("similar_to", "@foo < 50 and name = Jeff@");
        JsonArray array = new JsonArray();
        array.add(json1);
        array.add(json2);
        array.add(json3);
        array.add(json4);
        String json = array.toString();
        client.insert(json);
        Map<Long, Set<Object>> data = client.select("similar_to", "name = Jeff");
        for(Set<Object> set : data.values()){
            Assert.assertEquals(2, set.size());
        }
        Set<Long> records = client.find("name = John");
        for(long record : records){
            Assert.assertTrue(client.find("similar_to lnk2 "+record).isEmpty());
        }
    }

}