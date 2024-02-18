document.getElementById("signup-form").addEventListener("submit", function(event) {
    event.preventDefault();
  
    var username = document.getElementById("username").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;
  
    // 여기에 회원가입 처리 로직을 추가할 수 있습니다.
    // 예를 들어, fetch API를 사용하여 백엔드 서버에 회원가입 정보를 전송할 수 있습니다.
    // 이후 서버로부터의 응답을 처리하거나 오류를 표시할 수 있습니다.
    
    // 여기서는 간단히 메시지를 화면에 표시하는 예제를 제공합니다.
    var messageElement = document.getElementById("message");
    messageElement.innerText = "회원가입이 완료되었습니다!";
  });
  