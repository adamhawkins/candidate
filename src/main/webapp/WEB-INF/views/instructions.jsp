<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Candidate</title>

    <meta name="description" content="Candiate test">
    <meta name="author" content="Adam Hawkins">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>    
    <link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.1.1/css/bootstrap-combined.min.css" rel="stylesheet">
    <script src="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.1.1/js/bootstrap.min.js"></script>
<script>

</script>
</head>
<body>
    <div class="container-fluid">
      <div class="row-fluid">
      
      <h2>Instructions</h2>
      <h4>Complete as many steps as you can.</h4>
      
      <h3>Step 1 - Unix & Maven</h3>
      <p>ssh to the linux server using<p>
      <pre>ssh -i ~/id_rsa_delegate ec2-user@[hostname]</pre>
      <p>where [hostname] is the hostname provided in the email & id_rsa_delegate is:</p>
      
<pre>-----BEGIN RSA PRIVATE KEY-----
MIIEoQIBAAKCAQEAoDe+xGakqsuyvEXyCDst4pcWdeWY/Mlljwe7ktMUQq0c4Y9J
cft5610tdahTWwI3q/u0y0tZrin2CfsFApCrWi+/VOi4JYL9t1BClO7g/RMImQ2Y
24M+657htDRxtHIXvvE/ro0+KghBvkKczUuTOmSEPMPoP/w2C0TCFUU/ZwtS9vp+
TYo+f0TSyWYk/KCE8bAqZUMxGGRIsfJUuKTQ+iEj+IgEnBoBucKdtVBl20yZkYkY
9lNIIY5qGPwm47VhmiJRjtqTyEtxOyajWYbmPS3K3IqEGAtNGCCcq5TZSOEJynQM
Wi9AwqzY/Lj0+N+Ck54gcY135b8fOywXHmfeJwIBIwKCAQBt3RUY9e1B6sO0TThA
KJR+HnXNL7lc4d89gaUxeswQdrS37TmtProAemhQrfAD5ENunfhQ4zYuSKi2Yvwf
BB26L16gn5Q2+rya9TT4aUnSG64fzs83b/ChkYTTVyllypPwpW1/AcQ6FEpWlBO/
+U8DeCApquhmY81JjjvxVA44Bq4K1R83uV1e5+Gt5fwuTeZpSbpvooJCDoETCQNg
BlLmOAaXlsHqJXTUB3PjDHOAvzTgkfJT4z0p/WC5M4PL6dshZpgABfHM74LjHwEh
iT7ctEwBekKDai9SAtlvE5allP8koIS78P45JCHIh5cVYnhIea+1zRhJMIgoyyMt
MSqLAoGBAM82tfzhmusxcOeF+DS3Q2SwqxvEjZEwnxWu8NJYplqaA+/VCuEkUYrj
BWw2GDTBtAtkFYS4+3n/fxxJZ9ePkuAUC6ugsZiTSPF0rzvdlU255pqjW6fbwGdR
SK8sdlut57bKkJo8e2DmCRHuz26+sr7Em92Q0TaBJCFtr8XnGT63AoGBAMXweF6Q
AQB4wcIl0+CB1jA8zt696KHyGrbHPwgen+gltiqGa/NXpyx23P3UG1391wu7SWgt
rGpE0yDBfoR1bXdKtl2YyvqUz+Dl6jCAXseBauwMXJCR+rYZ6RsSd0HpgAmVJAXg
9G0epGseznSQUn8P+3f3m9NPNDc8qWiVZuwRAoGAcHzJMYHJIJcuqZHegwRmadw/
oVwSViG1civEj3Hz6Ap3KmxWXPZ1aKcgM23SoEvlZUT1vRP2OunIqPSmFe7atCgj
l68BUtOcoFVJLyCEQCMWyPmYJ+xSgTrBDqMbrhyTuwA/3rMeZ81VYYGjzmeFmsKA
f5fCB6Uw3vJmu+PagSECgYBrc+mSa25CFasC/peXIelNYtazbmhX6dP80o/udwZZ
c47GoL5CRYajG/RPR0IOc9sjoC8p7OiRddGysi6870oNjvVIwKiz6mI4QkvucZKJ
j2Xt2tMp6NiOvZvM3iN7jWLDX5c2ZCzqx33TwEQwph4nuDgN7NDvDb1CjqUbhE3Q
mwKBgQDGaLdjwqZYRM45TDW+ZR+Fe4hn7oQXXJs84dKuO7nHIEjOHaU+vyU4mYfh
bC5c8t9DoqYWEfJtBsvCH8L/jZ2mNeD9EifVhBhNRgNf+FGB0vV+MbBmbTPoSOav
iB7VXroXc3p/jvh4mXO1+Hcn+cn2m4DbXLHduP2+ivjonajG7g==
-----END RSA PRIVATE KEY-----</pre>

<p>'sudo su' to root and in /opt/ you'll find tomcat. install & configure tomcat to run on port 80</p>
<p>create a Maven war project containing <a href="/view.html">this page</a>, build as a ROOT.war and deploy to tomcat.</p>
<p>start tomcat and confirm you can access http://[hostname]/view.html</p>

<h3>Step 2 - Spring & Jquery</h3>
<p>Using Spring MVC define a controller using @Controller & @RequestMapping annotations for the follow urls</p>
<pre>http://[hostname]/mvc/view</pre>
<p>this will serve the view.html page as a jsp.</p>

<pre>http://[hostname]/mvc/json</pre>
<p>this will respond with a JSON response contain the name of a movie. e.g.</p>
<pre>{"name":"Jaws"}</pre>
<p>The movie name should be randomly selected from a list of your ten favourite films.</p>
<p>Using JQuery add a click handler to the button in the view html which calls the /mvc/json api and prepends the list with the movie name.</p>
<p>The list of movie names should not exceed 10 items so as items are added to the top of the list the 11th item should be removed from the bottom</p>

<h3>Step 3 - Ajax exception handling</h3>
<p>Update the /mvc/json api so that fetching from the movie list randomly fails 50% of the time resulting in a 500 http response code.</p>
<p>Update the view html to handle the 500 response and present an alert that is removed after 1s.</p>

<h3>Step 4 - Remote apis</h3>
<p>Implement a new component class using the @Component annotation which will make an http request to http://ec2-54-247-59-172.eu-west-1.compute.amazonaws.com/mvc/json to obtain the movie json.</p>
<p>The remote host should be configurable in a spring xml file.</p>
<p>The component should throw a runtime exception if it receives a 500 in response to the /mvc/json request.</p>
<p>@Autowire your new remoting component class to your /mvc/json api so that the movie is fetched from the remote server.</p>
<p>If your remoting component throws an exception then you should fall back to using a movie from your local list, though this should still fail 50% of the time as it had done previously.</p>

<h3>Step 5 - Provide source</h3>
<p>Ideally upload your source to github and email back the github url and we'll review the implementation & test the app, otherwise zip & upload the source to the /opt/ on your server and we'll fetch from there. 


<h3>Video of finished result</h3>
<video width="604" height="568" controls="controls">
  <source src="/completed.mp4" type="video/mp4"  >
  Your browser does not support the video tag.
</video>
<p>Note. the 'your movie' entries are the movies pulled from your local list, whereas the others are from the remote server.<p>
<p>the error message is shown because of a 500 from your /mvc/json, this should only happen if first the remote machine throws a 500, and then your fallback local list randomly throws a 500</p>

      </div>
    </div>
</body>
</html>