require 'rss/2.0'
require 'open-uri'

class RssFeedController < ApplicationController

  def index
    feed_url = 'http://www.baixaki.com.br/rss/tecnologia.xml'
    @feed = ""
    open(feed_url) do |http|
      response = http.read
      @feed = RSS::Parser.parse(response, false)
    end
  end
  
end
