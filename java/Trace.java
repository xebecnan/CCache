public class Trace{

  char tagCF;
  String pageIn;
  int cSize;
  int cTime;
  char tagWN;
  String pageOut;
  int dSize;
  int dTime;

  public Trace (char tagCF, String pageIn, int cSize, int cTime, char tagWN, String pageOut, int dSize, int dTime){
    this.tagCF=tagCF;
    this.pageIn=pageIn;
    this.cSize=cSize;
    this.cTime=cTime;
    this.tagWN=tagWN;
    this.pageOut=pageOut;
    this.dSize=dSize;
    this.dTime=dTime;

  }

  public String toString(){
    return "( "+tagCF+" "+pageIn+" "+cSize+" "+cTime+" "+tagWN+" "+pageOut+" "+dSize+" "+dTime+" )";
  }

}
