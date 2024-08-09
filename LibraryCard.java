public class LibraryCard {
    private Student1 owner;//ปผระกาศออบเจ๊กต์ owner ซืึ่งอยู่ในคลาส Student
    private int borrowcnt;
    public LibraryCard(){
        owner = null;
        borrowcnt = 0;
    }
    public void checkOut(int numOfBooks) {
        borrowcnt = borrowcnt + numOfBooks;
    }
    public void setOwnerName(Student1 student) {
        //เมธอดกำหนดผู้ยืม โดยจะรับข้อมูล
         owner = student;
    }
    public int getNumberOfBooks(){
        return borrowcnt;
    }
    public String getOwnerName(){
        return owner.getName();
    }
    public String toString(){
      return "Owner Name : " +owner.getName()+ " \n" + " Email : " +owner.getEmail() 
      + " \n" + " Books Borrowed" +borrowcnt;
    }
}
