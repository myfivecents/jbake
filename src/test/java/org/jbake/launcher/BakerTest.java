package org.jbake.launcher;

import static org.junit.Assert.*;

import java.io.File;
import java.util.Collections;

import org.apache.commons.configuration.CompositeConfiguration;
import org.jbake.app.ConfigUtil;
import org.jbake.app.JBakeException;
import org.junit.Test;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

public class BakerTest {
	
	

	@Test (expected = JBakeException.class)
	public void test() throws Exception {
		Baker baker = new Baker();
		LaunchOptions options = new LaunchOptions();
		CmdLineParser parser = new CmdLineParser(options);
		parser.parseArgument(Collections.EMPTY_LIST);
		File resourcesDirectory = new File("src/test/resources/config");
		CompositeConfiguration compositeConfig = ConfigUtil.load(resourcesDirectory);
		
		baker.bake(options, compositeConfig);
		
	}
	
	

}
