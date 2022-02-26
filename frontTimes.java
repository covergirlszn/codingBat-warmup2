public static void main(String[] args) {
    public String frontTimes(String str, int n) {
    String front="";
    String ft="";
    if(str.length()>3){
      front=str.substring(0,3);
    }
    else{
      front=str;
    }
    for(int i =0;i<n;i++){
      ft=ft+front;
    }
    return ft;
//no idea how to start a bloody java file. no main method that's why lol.
    
    
  }
}

  