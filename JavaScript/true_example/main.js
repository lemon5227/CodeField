const checkBox = document.querySelector('input');
const para = document.querySelector('p');

checkBox.addEventListener('change',result);

function result(){
    if(checkBox.checked){
        para.textContent = 'Child has earned $10 this week.';
    }else{
        para.textContent = 'Child has earned $5 this week.';
    }
}
