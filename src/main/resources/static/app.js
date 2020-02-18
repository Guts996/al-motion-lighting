var stompClient = null;

function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
    if (connected) {
        $("#conversation").show();
    }
    else {
        $("#conversation").hide();
    }
    $("#greetings").html("");
}

function connect() {
    var socket = new SockJS('/gs-guide-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        //stompClient.send("/app/hello", {}, JSON.stringify({'led': $("#led").val()}));
        stompClient.subscribe('/topic/dataStream', function (greeting) {
            showGreeting(JSON.parse(greeting.body).motion ,
                         JSON.parse(greeting.body).light ,
                         JSON.parse(greeting.body).led);
        });
    });
}

function disconnect() {
    if (stompClient !== null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
    $("#greetings").html("<h1 style='color:dark' > State : Not connected </h1>");
    $("#motion").html("<h1 style='color:dark' > Not Connected Motion Sensor </h1>");
    $("#light").html("<h1 style='color:dark' > Not Connected Motion Sensor  </h1>");
    $("#led").html("<h1 style='color:dark' > Not Connected Motion Sensor  </h1>");

}

function sendName() {
    stompClient.send("/app/hello", {}, JSON.stringify({'led': $("#led").val()}));
}

function showGreeting( motion , light , le ) {
    if (motion == 0) {
        $("#motion").html("<h1 style='color:black' > Motion Undetected </h1>");
    } else {
        $("#motion").html("<h1 style='color:green' > Motion Detected </h1>");
    }
    if (light > 500) {
        $("#light").html("<h1 style='color:red' > Dark Environment </h1>");
    } else {
        $("#light").html("<h1 style='color:green' > Shiny Environment </h1>");
    }
    if (le == 0) {
        $("#led").html("<h1 style='color:red' > Led : Off</h1>");
    } else {
        $("#led").html("<h1 style='color:green' > Led : On</h1>");
    }
    $("#greetings").html("Connection established");
}

$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $( "#connect" ).click(function() { 
        connect();
        setInterval(() => {
            sendName();
        }, 1000);
    });
    $( "#disconnect" ).click(function() { disconnect(); });
    $( "#send" ).click(function() { sendName(); });
});


