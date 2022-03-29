from survey import AnnoySurvey

#定义一个问题表示调查的对象
question = "What language did you first learn to speak?"
my_survey = AnnoySurvey(question)

#显示问题并储存答案
my_survey.show_question()
print('Enter "q" at any time to quit.\n')
while True:
    response = input('Language:')
    if response == 'q':
        break
    my_survey.store_responses(response)

#显示调查结果
print('\n Thank you to everyone participated in the survey!\n')
my_survey.show_results()