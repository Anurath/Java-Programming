package collections;

public class PlayList {

	private String name;
	private int cap;
	
	private int cnt;
	
	private PlayList() {}
	
	public PlayList(String name,int cap)
	{
		this.name = name;
		this.cap = cap;
		songs = new Song[cap];
	}
	
	private Song[] songs;
	
	public String getName()
	{
		return name;
	}
	
	public boolean setName(String name)
	{
		if(name!=null && name.length()!=0)
		{
			this.name = name;
			System.out.println("PlayList name changed!");
			return true;
		}
		System.out.println("Enter valid PlayList name.");
		return false;
	}
	
	public int getCap()
	{
		return cap;
	}
	
	public void showPlayList()
	{
		if(cnt>0)
		{
			for(int i=0;i<cnt;i++)
			{
				System.out.print(songs[i]+",");
			}
			System.out.println();
		}
		else {
			System.out.println("PlayList is Empty!");
		}
	}
	//Song addition
	public boolean addSong(String name,String singer,String duration,String writer,String movie)
	{
		if(cnt<cap)
		{
			Song newSong = new Song(name,singer,duration,writer,movie);
			int i;
			for(i=0;i<cnt;i++)
				if(newSong.equals(songs[i]))
					break;
			if(i==cnt)
			{
				songs[cnt]=newSong;
				cnt++;
				System.out.println("Song added.");
				return true;
			}
			else
				System.out.println("Song already present!");
		}
		return false;
	}
	
	//Remove a song
	public boolean removeSong(String name,String movie)
	{
		if(cnt!=0)
		{
			boolean found = false;
			int i;
			for(i=0;i<cnt;i++)
			{
				if(!found)
				{
					if(name.equalsIgnoreCase(songs[i].getName()) && movie.equalsIgnoreCase(songs[i].getMovie()))
					{
						found = true;
					}
				}
				else
				{
					songs[i-1] = songs[i];
				}
			}
			if(found)
			{
				System.out.println("Song removed!");
				songs[cnt]=null;
				cnt--;
				return true;
			}
			else
			{
				System.out.println("Song not found!");
			}
		}
			System.out.println("PlayList is empty!");
			return false;
	}
	
	public void playNext(String name,String movie)
	{
		int i=0;
		for(;i<cnt;i++)
			if(songs[i].getName()==name && songs[i].getMovie() == movie)
				break;
		if(i!=cnt)
		{
			
		}
		
	}
}
