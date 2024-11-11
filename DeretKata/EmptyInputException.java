class EmptyInputException extends Exception{

    public EmptyInputException(){
        super("Input tidak boleh kosong");
    }
}