package test.lib;

import java.io.IOException;
import java.io.InputStream;

public class ResourceLoader
{
	public InputStream load(String moduleName, String ResourcePath) throws IOException
	{
		final var module = getModule(moduleName);
		return module.getResourceAsStream(ResourcePath);
	}

	private static Module getModule(String moduleName)
	{
		return ModuleLayer.boot().findModule(moduleName).orElse(null);
	}
}
