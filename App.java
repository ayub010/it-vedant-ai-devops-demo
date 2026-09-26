import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class App {

    private static final int PORT = 8080;

    public static void main(String[] args) throws IOException {

        HttpServer server =
                HttpServer.create(new InetSocketAddress("0.0.0.0", PORT), 0);

        server.createContext("/", App::handleHome);

        server.setExecutor(null);

        System.out.println(
                "IT Vedant AI-Powered DevOps Application started on port "
                        + PORT
        );

        server.start();
    }

    private static void handleHome(HttpExchange exchange) throws IOException {

        String html = """
                <!DOCTYPE html>
                <html lang="en">

                <head>

                    <meta charset="UTF-8">

                    <meta name="viewport"
                          content="width=device-width, initial-scale=1.0">

                    <title>IT Vedant | AI-Powered DevOps</title>

                    <style>

                        :root {
                            --green: #78b900;
                            --green-dark: #5f9800;
                            --navy: #17234b;
                            --text: #25272c;
                            --light: #f7faf3;
                        }

                        * {
                            box-sizing: border-box;
                        }

                        body {
                            margin: 0;
                            font-family: Arial, Helvetica, sans-serif;
                            background:
                                linear-gradient(
                                    135deg,
                                    #ffffff 0%,
                                    var(--light) 100%
                                );
                            color: var(--text);
                        }

                        .top-bar {
                            height: 8px;
                            background:
                                linear-gradient(
                                    90deg,
                                    var(--green),
                                    #a8d63b,
                                    var(--navy)
                                );
                        }

                        .container {
                            max-width: 1050px;
                            margin: auto;
                            padding: 30px 20px 50px;
                        }

                        header {
                            display: flex;
                            justify-content: space-between;
                            align-items: center;
                            gap: 20px;
                            padding: 10px 0 30px;
                        }

                        .brand {
                            font-size: 32px;
                            font-weight: 800;
                            letter-spacing: 1px;
                            color: var(--navy);
                        }

                        .brand span {
                            color: var(--green);
                        }

                        .tagline {
                            color: var(--navy);
                            font-size: 15px;
                            font-weight: 600;
                        }

                        .hero {
                            background: white;
                            border-radius: 24px;
                            padding: 45px;
                            box-shadow:
                                0 12px 35px
                                rgba(23, 35, 75, 0.12);

                            border-left:
                                8px solid var(--green);

                            position: relative;
                            overflow: hidden;
                        }

                        .badge {
                            display: inline-block;
                            background: var(--green);
                            color: white;
                            padding: 8px 15px;
                            border-radius: 20px;
                            font-size: 13px;
                            font-weight: 700;
                            letter-spacing: .5px;
                        }

                        h1 {
                            margin: 18px 0 10px;
                            font-size: 60px;
                            line-height: 1;
                            color: var(--navy);
                        }

                        h1 span {
                            color: var(--green);
                        }

                        .subtitle {
                            font-size: 21px;
                            line-height: 1.5;
                            max-width: 750px;
                            color: #4b5263;
                        }

                        .flow {
                            margin-top: 35px;

                            display: grid;

                            grid-template-columns:
                                repeat(
                                    auto-fit,
                                    minmax(140px, 1fr)
                                );

                            gap: 14px;
                        }

                        .step {
                            background: #ffffff;

                            border:
                                1px solid #dfe7d2;

                            border-radius: 15px;

                            padding: 18px 12px;

                            text-align: center;

                            font-weight: 700;

                            color: var(--navy);
                        }

                        .number {
                            width: 34px;
                            height: 34px;

                            margin:
                                0 auto 10px;

                            display: grid;

                            place-items: center;

                            border-radius: 50%;

                            background:
                                var(--green);

                            color: white;
                        }

                        .access {
                            margin-top: 28px;

                            padding: 22px;

                            border-radius: 15px;

                            background:
                                var(--navy);

                            color: white;
                        }

                        .access strong {
                            color: #a9dc35;
                        }

                        code {
                            background:
                                rgba(255,255,255,.12);

                            padding: 5px 9px;

                            border-radius: 6px;
                        }

                        footer {
                            text-align: center;

                            margin-top: 28px;

                            color: #667085;

                            font-size: 14px;
                        }

                    </style>

                </head>

                <body>

                    <div class="top-bar"></div>

                    <div class="container">

                        <header>

                            <div class="brand">
                                I.T.<span>VEDANT</span>
                            </div>

                            <div class="tagline">
                                Learn | Grow | Build Your Future
                            </div>

                        </header>

                        <section class="hero">

                            <div class="badge">
                                CORPORATE CAPTAIN SESSION
                            </div>

                            <h1>
                                AI-Powered
                                <span>DevOps</span>
                            </h1>

                            <p class="subtitle">

                                Welcome to the IT Vedant
                                AI-Powered DevOps demonstration.

                                This application demonstrates the journey
                                from Java source code to a Docker container
                                running on AWS EC2.

                            </p>

                            <div class="flow">

                                <div class="step">
                                    <div class="number">1</div>
                                    Java Code
                                </div>

                                <div class="step">
                                    <div class="number">2</div>
                                    Git
                                </div>

                                <div class="step">
                                    <div class="number">3</div>
                                    GitHub
                                </div>

                                <div class="step">
                                    <div class="number">4</div>
                                    Dockerfile
                                </div>

                                <div class="step">
                                    <div class="number">5</div>
                                    Docker
                                </div>

                                <div class="step">
                                    <div class="number">6</div>
                                    AWS EC2
                                </div>

                            </div>

                            <div class="access">

                                <strong>
                                    Application Status:
                                </strong>

                                Running Successfully

                                <br><br>

                                Access using:

                                <code>
                                    http://&lt;EC2-PUBLIC-IP&gt;:8080
                                </code>

                            </div>

                        </section>

                        <footer>

                            AI-Powered DevOps Workflow
                            &nbsp;•&nbsp;
                            I.T. Vedant

                        </footer>

                    </div>

                </body>

                </html>
                """;

        byte[] response =
                html.getBytes(StandardCharsets.UTF_8);

        exchange.getResponseHeaders()
                .set(
                    "Content-Type",
                    "text/html; charset=UTF-8"
                );

        exchange.sendResponseHeaders(
                200,
                response.length
        );

        try (OutputStream output =
                     exchange.getResponseBody()) {

            output.write(response);
        }
    }
}
