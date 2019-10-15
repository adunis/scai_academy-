var baseUrl = "https://api.icndb.com/jokes/";
var content;

  var joke = "";

  while (joke === undefined) {
  }getUrlContent();

  document.getElementById('content').innerHTML = joke;


function getJoke(response) {
  var joke = response.data.value.joke;
}



function randomId() {

  var min = 1;
  var max = 999;
  var random = 0;
  var random =
    Math.floor(Math.random() * (+max - +min)) + +min;
  console.log("Random Number Generated : " + random);
  return random;
}

function concatUrl(id) {
  return url = baseUrl + id;
}

function getUrlContent() {
  try {
    let url = concatUrl(randomId());
    axios.get(url)
      .then(function (response) {
        getJoke(response);
      })
      .catch(function (e) {
        console.log(e);
      });
  } catch (e) {
    e.error;
  }
}