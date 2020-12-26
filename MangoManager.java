package com.sist.client;
import java.util.*;
import java.io.*;

public class MangoManager {
	private static ArrayList<MangoVO> list=
			 new ArrayList<MangoVO>();
	static
	{
		try
		{ 
			FileInputStream fr=new FileInputStream("C:\\javaDev\\mango.txt");
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			while(true)
			{
				String Mango=in.readLine();
				if(Mango==null) break;  
				StringTokenizer st=new StringTokenizer(Mango,"|");
				while(st.hasMoreTokens())
				{
					try {
					MangoVO vo=new MangoVO();
					vo.setMno(Integer.parseInt(st.nextToken()));
					vo.setCno(Integer.parseInt(st.nextToken()));
					vo.setImg(st.nextToken());
					vo.setTitle(st.nextToken());
					vo.setReview(st.nextToken());
					vo.setPlace(st.nextToken());
					vo.setContent(st.nextToken());
					list.add(vo);
					}catch(Exception ex){}
				}
			}
			
		}catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public ArrayList<MangoVO> MangoListData(int page)
	{
		ArrayList<MangoVO> Mango=new ArrayList<MangoVO>();
		int i=0;
		int j=0;
		int pagecnt=(page*10)-10;
		for(MangoVO vo:list)
		{
			if(i<10 && j>=pagecnt)
			{
				Mango.add(vo);
				i++;
			}
			j++;
		}
		return Mango;
	}
	
	public int MangoTotalPage()
	{
		return (int)(Math.ceil(list.size()/10.0));
	}
	
	public MangoVO MangoDetailData(int mno)
	{
		return list.get(mno-1);
	}
	
	public ArrayList<MangoVO> MangoAllData(int cno)
	{
		ArrayList<MangoVO> Mango=new ArrayList<MangoVO>();
		for(MangoVO vo:list)
		{
			if(vo.getCno()==cno)
			{
				Mango.add(vo);
			}
		}
		return Mango;
	} 
	
	public ArrayList<MangoVO> MangoFindData(String ss)
	{
		ArrayList<MangoVO> Mango=new ArrayList<MangoVO>();
		for(MangoVO vo:list)
		{
			if(vo.getTitle().contains(ss))
			{
				Mango.add(vo);
			}
		}
		return Mango;
	}
	
}
