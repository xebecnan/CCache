import java.util.*;

public class Analyze{

public static void main(String args[]){
   
  if(args.length!=1){
	System.out.println("Usage: java Analyze <dir within outputFiles to analyze>");
	System.exit(0);
  }

  ArrayList<Trace> LZOdata = Reader.read("../outputFiles/"+args[0]+"/LZO.results");
  ArrayList<Trace> LZRW1data = Reader.read("../outputFiles/"+args[0]+"/LZRW1.results");
  ArrayList<Trace> WK2data = Reader.read("../outputFiles/"+args[0]+"/WK2.results");
  ArrayList<Trace> WKdmdata = Reader.read("../outputFiles/"+args[0]+"/WKdm.results");
 
  System.out.println("LZO average compression time (nsec) " + average(LZOdata));
  System.out.println("LZRW1 average compression time (nsec) " + average(LZRW1data));
  System.out.println("WK2 average compression time (nsec) " + average(WK2data));
  System.out.println("WKdm average compression time (nsec) " + average(WKdmdata));
}//main

public static double average(ArrayList<Trace> traces){
  
  long sumCTimes = 0;
  int dataLength =0;
  for(Trace t:traces){
    sumCTimes+=t.cTime;
    dataLength++;
  }

  return (double)sumCTimes/dataLength;
}//average
 
}


