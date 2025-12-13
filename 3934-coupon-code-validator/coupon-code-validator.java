class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> ans = new ArrayList<>();
        List<Integer> valid = new ArrayList<>();
        Set<String> validBusiness = new HashSet<>();
        validBusiness.add("electronics");
        validBusiness.add("grocery");
        validBusiness.add("pharmacy");
        validBusiness.add("restaurant");

        for(int i=0; i<code.length; i++){
            if(!isActive[i] || code[i].equals("") || !isAlphaNumeric(code[i])) continue;
            if(!validBusiness.contains(businessLine[i])) continue;
            valid.add(i);
        }
        Collections.sort(valid, (a,b) -> {
            if(!businessLine[a].equals(businessLine[b])){
                return businessLine[a].compareTo(businessLine[b]);
            }
            return code[a].compareTo(code[b]);

        });

        for(int index : valid){
            ans.add(code[index]);
        }
        return ans;
    }
    boolean isAlphaNumeric(String business){
        for(int i=0; i<business.length(); i++){
            char ch = business.charAt(i);
            if(!Character.isLetterOrDigit(ch) && ch!='_') return false;
        }
        return true;
    }
}
