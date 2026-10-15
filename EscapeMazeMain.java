void main() {
   // CodeGenerator masterCode = new CodeGenerator("415", "CLOCK"); //for testing
    CodeGenerator masterCode = new CodeGenerator();
    String roomCode = "TIME-415-CLOCK";
    String roomCodeCopy = roomCode;
    int firstDash = roomCodeCopy.indexOf("-");
    String missionClue = roomCodeCopy.substring(0, firstDash);
    roomCodeCopy = roomCode.substring(firstDash + 1);
    int secondDash = roomCodeCopy.indexOf("-");
    String lockCode = roomCodeCopy.substring(0, secondDash);
    String clearanceWord = roomCodeCopy.substring(secondDash + 1);
    IO.println("Master code: " + masterCode);
    IO.println("Room Code: " + roomCode);
    IO.println("Mission Clue: " + missionClue);
    IO.println("Lock Code: " + lockCode);
    IO.println("Clearance Word: " + clearanceWord);

    int nextRoom = lockCode.compareTo(masterCode.getLockCode());
    boolean escaped = clearanceWord.equals(masterCode.getClearanceWord());
    IO.println("Escaped with LockCode (yes, if 0): " + nextRoom);
    IO.println("Escaped with Clearance Word? " + escaped);


    IO.println("If you didn't escape Go right if positive; left if negative " + nextRoom);

}
