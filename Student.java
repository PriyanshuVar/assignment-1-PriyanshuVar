class Student
{
    String fname;
    String lname;
    String phone;
    String email;
    public Student(String fname, String lname, String phone, String email) {
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.email = email;
    }
    @Override
    public String toString() {
        return ("-------- * -------- * -------- * --------"+"\n"+
                "First name :- "+ fname + "\n" +"Last name :- "+ lname + "\n" + "phone number :- "+ phone + "\n" + "email id :- "+ email);
    }
    public String disp()
    {
        return fname + " " + lname;
    }
}
