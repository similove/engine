const http = require('http');

const server = http.createServer();

server.on('request', (request, response)=>{
  const url = request.url;
  if(url === '/getScript') {
    console.info('/getScript be invoked.');
    response.end('show()');
  } else {
    response.end('404');
  }
});

server.listen(3000,()=>{
  console.info('server listen at http://127.0.0.1:3000');
});