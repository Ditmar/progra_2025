package expand;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// disclaimer: the current complexitly is O (n + M ) 
// but this code can be improve the performace to ->  O(n)
// this is only an example of how to use the Stringbuilder
// and the regular expresion 
public class ExpandString {
    private String input;
    private ArrayList<PatternsList> numberList;

    public ExpandString() {
        // this is hardcoded please refactor this code to take the data from the input
        // keyboard
        this.input = "a3b2c4w456";
        this.numberList = new ArrayList<>();
    }

    public String expand() {
        StringBuilder result = new StringBuilder("");
        findNumbers();
        for (Integer i = 0; i < this.numberList.size(); i++) {
            PatternsList item = this.numberList.get(i);
            String character = item.getPrefixCharacter(this.input);
            Integer number = item.getNumber();
            String repeat = repeatString(character, number);
            result.append(repeat);
        }
        return result.toString();
    }

    private void findNumbers() {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(this.input);
        while (matcher.find()) {
            String subNumberString = this.input.substring(matcher.start(), matcher.end());
            this.numberList.add(new PatternsList(Integer.parseInt(subNumberString), matcher.start(), matcher.end()));
        }

    }

    private String repeatString(String character, Integer repeatNumber) {
        StringBuilder repeticionResult = new StringBuilder("");
        for (Integer i = 0; i < repeatNumber; i++) {
            repeticionResult.append(character);
        }
        return repeticionResult.toString();
    }

}
