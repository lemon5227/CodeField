class AnnoySurvey():
    """收集匿名调查问卷的答案"""
    def __init__(self,question):
        '''储存一个问题，并为储存答案做准备'''
        self.question = question
        self.responses = []
    
    def show_question(self):
        '''显示调查问卷'''
        print(self.question)
    
    def store_responses(self,new_response):
        '''存储单份调查问卷'''
        self.responses.append(new_response)

    def show_results(self):
        '''显示收集到的所有问卷'''
        print("Survey results:")
        for response in self.responses:
            print("- "+response)
            
