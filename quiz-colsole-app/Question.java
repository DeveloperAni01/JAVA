public class Question {
    private String id;
    private String question;
    private String[] options;
    private String answer;

    public Question(String id, String question, String[] options, String answer) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.answer = answer;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getQuestion() {
        return id + ". " + question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }

    public void  getOptions() {
        for (String opt : options) {
            System.out.println(opt);
        }
    }
    public void setOptions(String[] options) {
        this.options = options;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    
}
