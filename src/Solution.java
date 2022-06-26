class Solution {
    // Palindrome = google what it means ** important **
    public boolean isPalindrome(String checkString)
    {
        if(checkString == null)
            return false;


        //          " n   o   o   n"
        int left = 0;
        int right = checkString.length() - 1;

        for(int i = 0; i < checkString.length(); ++ i )
        {
            //ex...  %*(#&^$(!@^!$&)$&!)!%&*@
            // IGNORE 
            if(!Character.isLetterOrDigit(checkString.charAt(left) ) ){
                ++ left;

            } else if(!Character.isLetterOrDigit(checkString.charAt(right) ) ){
                -- right;

                // ABC
                // abc
            } else if( Character.toLowerCase(checkString.charAt(left) ) !=
                    Character.toLowerCase(checkString.charAt(right) ) ){
                return false;

            } else{
                ++ left;
                -- right;
            }
        } return true;

    }

}