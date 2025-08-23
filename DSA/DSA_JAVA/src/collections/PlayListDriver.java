package collections;

public class PlayListDriver {

	public static void main(String[] args)
	{
		PlayList p1 = new PlayList("Hindi Songs", 5);
		
		p1.addSong("To Chalu","Rupkumar Thakur","05:40","Rupkumar Thakur", "Border");
		p1.addSong("To Chalu1","Rupkumar Thakur","05:40","Rupkumar Thakur", "Border");
		p1.addSong("To Chalu2","Rupkumar Thakur","05:40","Rupkumar Thakur", "Border");
		p1.removeSong("To Chalu","Border");
		p1.showPlayList();
		
	}
}
