var data: {
  'jsonrpc': '2.0',
  'method': 'generateIntegers',
  'params': {
    'apiKey': '00000000-0000-0000-0000-000000000000',
    'n': 10,
    'min': 1,
    'max': 10,
    'replacement': true,
    'base': 10
  },
  'id': 2601
};


var content = generateRequestURL(5,1,20);
document.getElementById('text').innerHTML = content;

function getJoke(response) {
  var numberResult = response.data.value.joke;
}

function getUrlContent(num, min, max) {
  $.get( "test.php", { name: "John", time: "2pm" } );
}