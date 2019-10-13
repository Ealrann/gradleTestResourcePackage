package test.main;

import java.io.IOException;
import java.util.Scanner;

import test.lib.ResourceLoader;

public class Main
{
	private static final String MODULE_NAME = "test.main";
	private static final String DATA_PATH = "test/main/asset/data.txt";

	public static void main(String[] args)
	{
		final ResourceLoader loader = new ResourceLoader();

		try (var stream = loader.load(MODULE_NAME, DATA_PATH))
		{
			try (var scanner = new Scanner(stream))
			{
				scanner.useDelimiter("\n");
				while (scanner.hasNext())
				{
					System.out.println(scanner.next());
				}
			}

		} catch (final IOException e)
		{
			e.printStackTrace();
		}
	}
}
