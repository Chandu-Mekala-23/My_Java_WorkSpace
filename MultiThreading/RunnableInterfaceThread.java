class RunnableInterfaceThread implements Runnable {

    public void run(){
        try{
            System.out.println("Thread  "+ Thread.currentThread().getId() +" Running");
        }
        catch(Exception e){
            System.out.println("--ERROR----"+ e);
        }
    }
    public static void main(String args[])
    {
        for(int i=0;i<9;i++)
        {
            RunnableInterfaceThread object = new RunnableInterfaceThread();
            Thread t = new Thread(object);
            t.start();
        }
    }
    
}
