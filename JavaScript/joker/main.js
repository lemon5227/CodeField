let myname = document.getElementById('userName');
let randomy = document.querySelector('.random');
let story = document.querySelector('.story');

function randomValueFromArray(array){
    const random = Math.floor(Math.random() * array.length);
    return array[random];
}

let storyText = '今天气温 35 摄氏度，:insertx:出门散步。当走到:inserty:门前时，突然就:insertz:。人们都惊呆了，李雷全程目睹但并没有慌，因为:insertx:是一个 140 公斤的胖子，天气又辣么热。';
let insertX = ['怪兽威利', '大老爹', '圣诞老人'];
let insertY = ['肯德基', '迪士尼乐园', '白宫'];
let insertZ = ['自燃了', '在人行道化成了一坨泥', '变成一只鼻涕虫爬走了'];

randomy.addEventListener('click', result);
function result(){
    let newStory = storyText;

    let x = randomValueFromArray(insertX);
    let y = randomValueFromArray(insertY);
    let z = randomValueFromArray(insertZ);

    newStory = newStory.replace(':insertx',x);
    newStory = newStory.replace(':insertx',x);
    newStory = newStory.replace(':inserty',y);
    newStory = newStory.replace(':insertz',z);
    if(myname.value !== ''){
        const name = myname.value;
        newStory = newStory.replace('李雷',name);
    }
    
    if(document.getElementById('american').checked){
        const weight = Math.round(140*2.20462)+'镑';
        const temperature = Math.round(35*9/5+32)+'华氏度';
        newStory = newStory.replace('35 摄氏度',temperature);
        newStory = newStory.replace('140 公斤',weight);
    }

    story.textContent = newStory;
    story.style.visibility = 'visible';

}