package as;

import org.testng.annotations.AfterTest;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestNGAssertionDemo {
            
            @Test
            public void testAssertions() {
            	JSONObject actual = new JSONObject();
            	actual.put("id", 1);
            	actual.put("name", "Mike");

            	JSONAssert.assertEquals("{id:1}", actual, false); 				 
            	JSONAssert.assertEquals("{name:\"Mike\"}", actual, false);		
            	JSONAssert.assertEquals("{name:Mike, id:1}", actual, false);	
            	
            	actual.put("id", 2);
            	actual.put("name", "Helen");

            	JSONAssert.assertEquals("{id:2}", actual, false); 				 
            	JSONAssert.assertEquals("{name:\"Helen\"}", actual, false);		
            	JSONAssert.assertEquals("{name:Helen, id:1}", actual, false);		
            	actual.put("id", 2);
            	actual.put("name", "Helen");

            	JSONAssert.assertEquals("{id:108}", actual, false); 				 
            	JSONAssert.assertEquals("{name:\"Maya\"}", actual, false);		
            	JSONAssert.assertEquals("{name:Maya, id:1}", actual, false);		
            	actual.put("id", 108);
            	actual.put("name", "Maya");

            	JSONAssert.assertEquals("{id:9}", actual, false); 				 
            	JSONAssert.assertEquals("{name:\Olive\"}", actual, false);		
            	JSONAssert.assertEquals("{name:Olive, id:9}", actual, false);		
            		
            		
            	
            	
    }
