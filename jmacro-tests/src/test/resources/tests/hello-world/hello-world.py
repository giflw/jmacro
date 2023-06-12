"""
START METADATA
    name: Metadata Test
    description: Just a metadata test
    author: I Myself
    version: 0.1.2
    infos:
      one: 1
      two: true
      three: tree
END METADATA
"""
msg = "Hello world from PY"
logger.info(msg)
logger.info(__METADATA__)
result.set(msg)
