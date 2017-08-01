package com.ruleshere;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
 
import java.io.File;
import java.io.IOException;
 
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
 
public class RuleTest {
 
    @Rule
    public TemporaryFolder tmpFolder = new TemporaryFolder();
	//not working
//	@Rule
//	public TemporaryFolder folder = TemporaryFolder.builder()
//	    .assureDeletion()
//	    .build(); 
    @Test
    public void shouldCreateNewFileInTemporaryFolder() throws IOException {
        File created = tmpFolder.newFile("file.txt");
 
        assertTrue(created.isFile());
        assertEquals(tmpFolder.getRoot(), created.getParentFile());
    }
}