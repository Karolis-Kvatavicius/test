package lt.baltictalents.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCreatorTest {

    @Test
    public void create() {
       assertEquals("abc", new StringCreator().create( "a", "b", "c" )  );
       assertEquals("ab", new StringCreator().create( "a", "b", "")  );
       assertEquals("ad", new StringCreator().create( "", "a", "d")  );
       assertEquals("", new StringCreator().create( "", "", "")  );
       assertEquals("labasnull", new StringCreator().create( "labas", null, "")  );
       assertEquals("nullnullnull", new StringCreator().create( null, null, null)  );
    }

    @Test
    public void create1() {
        assertEquals("ab", new StringCreator().create( "a", "b")  );
        assertEquals("a", new StringCreator().create( "a", "")  );
        assertEquals("", new StringCreator().create( "", "")  );
        assertEquals("labasnull", new StringCreator().create( "labas", null)  );
        assertEquals("nullnull", new StringCreator().create( null, null)  );
    }
}