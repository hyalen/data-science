import bs4

from urllib.request import urlopen as uReq
"""urlopen is the function with the uReq alias responsible
for establishing a connection with the website that is going to
be scrapped"""

from bs4 import BeautifulSoup as soup

"""BeautifulSoup is respomsible for parsing the HTML from a webpage and
make it more 'read'able' for our scrapper"""
url = "https://en.wikipedia.org/wiki/Linus_Torvalds"

"""uReq will create a connection, grab the webpage and dounload it"""
uClient = uReq(url)

"""allocates this data into a variable"""
page_html = uClient.read()

"""closes the connection and html file"""
uClient.close()

"""defines the format that you want the page to be parsed, it could be JSON, xml etc"""
page_soup = soup(page_html, "html.parser")

"""grabs all the elements from a specific html class"""
tables = page_soup.findAll("table", {"class":"wikitable"})

for td in tables:
	reference = tables.table.sub["reference"]
