import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
class Image1
{
	public static void main(String[] args)
	{
		File file = new File("Downloads//mahara.jpeg");
		try
		{
			BufferedImage image = ImageIO.read(file);
			for (int i=0;i<image.getHeight() ;i++ )
			{
				for (int j=0;j<image.getWidth() ;i++ )
				{
					Color c1 = new Color(image.getRGB(j,i));
					if (c1.getRed()==0&&c1.getGreen()==0&&c1.getBlue()==0)
					{
						System.out.print("  ");
					}
					else
					{
						System.out.print("@ ");
					}
				}
				System.out.println();
			}
		}
		catch (Exception e)
		{
			System.out.println("Something went wrong!");
		}
	}
}