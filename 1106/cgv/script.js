const next = document.querySelector('.next');
const prev = document.querySelector('.prev');

const listWrap = document.querySelector('.listWrap');
const lists = document.querySelectorAll('.listWrap > div');

let num = 0;
let show = 5;
let total = lists.length;

// clone
for(i = 0; i < 4; i++){
    lists.forEach((i) => {
        const clone = i.cloneNode(true);
        listWrap.append(clone);
    })

}