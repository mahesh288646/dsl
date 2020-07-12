def checkOutFrom(repo) {
  git credentialsId: 'Git-ID' url: "git@github.com:mahesh288646/${repo}"
}

return this