$(function(){


    var container = $("#container")
    container.shuffleLetters();


    setInterval(function(){

        container.shuffleLetters({
            "th:text": "${name}"
        });


    },2000);

});

