import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Texture {
	public int[] pixels;
	private String loc;
	public final int Size;

	public Texture(String location, int size) {
		loc = location;
		Size = size;
		pixels = new int[Size * Size];
		load();
	}

	private void load() {
		try {
			BufferedImage image = ImageIO.read(new File(loc));
			int w = image.getWidth();
			int h = image.getHeight();
			image.getRGB(0, 0, w, h, pixels, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Texture wood = new Texture("res/wood.png", 64);
	public static Texture brick = new Texture("res/redbrick.png", 64);
	public static Texture bluestone = new Texture("res/bluestone.png", 64);
	public static Texture stone = new Texture("res/greystone.png", 64);
}
