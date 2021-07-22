
SUMMARY = "Async http client/server framework (asyncio)"
HOMEPAGE = "https://github.com/aio-libs/aiohttp"
AUTHOR = "Nikolay Kim <fafhrd91@gmail.com>"
LICENSE = "Apache"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3bf3d48554bdca1ea7fdb48de378c2ca"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/99/f5/90ede947a3ce2d6de1614799f5fea4e93c19b6520a59dc5d2f64123b032f/aiohttp-3.7.4.post0.tar.gz"
SRC_URI[md5sum] = "7052a8e9877921d73da98d2b18c9a145"
SRC_URI[sha256sum] = "493d3299ebe5f5a7c66b9819eacdcfbbaaf1a8e84911ddffcdc48888497afecf"

S = "${WORKDIR}/aiohttp-3.7.4.post0"

DEPENDS += " ${PYTHON_PN}-pytest-runner-native"
RDEPENDS_${PN} = "python3-attrs python3-chardet python3-multidict python3-async-timeout python3-yarl python3-typing-extensions"

BBCLASSEXTEND = "native nativesdk"
