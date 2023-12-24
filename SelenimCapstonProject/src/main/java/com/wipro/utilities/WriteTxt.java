package com.wipro.utilities;

import java.io.FileWriter;


public class WriteTxt {
	
	public void text(String t) throws Exception {
		FileWriter file= new FileWriter("D:\\SeleniumProjects\\SelenimCapstonProject\\src\\main\\resources\\testdata\\Text.txt",true);
        file.write(t);
        file.write("\n");
        file.close();
        System.out.println(t);
	}
	public void prizeTxt(String name,String prize) throws Exception{
		FileWriter file=new FileWriter("D:\\SeleniumProjects\\SelenimCapstonProject\\src\\main\\resources\\OutputData\\prize.txt",true);
		file.write(name);
		file.write("-");
		file.write(prize);
		file.write("\n");
		file.close();
	}

}
