/**
 *This file is the sample code against we run our unit test.
 *It is placed src/test/files in order to not be part of the maven compilation.
 **/
class AvoidGetInfosInLoop {

  int aField;

  public void getInfos() { 
  	test.getInfo(); // Noncompliant {{Bad getInfos}}
  	test.getInfo(); // Noncompliant {{Bad getInfos}}
    int c=0;
    int b=0;
    b =-2;
    int v=3+1;
    test2.getInfo();

  }

}
